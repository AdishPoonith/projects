.class final Lb5/h$b$a;
.super Lb5/h$b$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb5/h$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lb5/h$b$b;-><init>(Lb5/h$a;)V

    return-void
.end method

.method synthetic constructor <init>(Lb5/h$a;)V
    .locals 0

    invoke-direct {p0}, Lb5/h$b$a;-><init>()V

    return-void
.end method
