.class public final Lla/m1$a;
.super Lv9/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lla/m1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lv9/b<",
        "Lla/g0;",
        "Lla/m1;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 2

    sget-object v0, Lla/g0;->k:Lla/g0$a;

    sget-object v1, Lla/m1$a$a;->j:Lla/m1$a$a;

    invoke-direct {p0, v0, v1}, Lv9/b;-><init>(Lv9/g$c;Lda/l;)V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g;)V
    .locals 0

    invoke-direct {p0}, Lla/m1$a;-><init>()V

    return-void
.end method
