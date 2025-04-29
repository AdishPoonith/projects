.class public final Ls1/v1$k;
.super Ls1/v1$l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/v1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "k"
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# direct methods
.method private constructor <init>(Ls1/v1$l$a;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Ls1/v1$l;-><init>(Ls1/v1$l$a;Ls1/v1$a;)V

    return-void
.end method

.method synthetic constructor <init>(Ls1/v1$l$a;Ls1/v1$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ls1/v1$k;-><init>(Ls1/v1$l$a;)V

    return-void
.end method
