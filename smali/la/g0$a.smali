.class public final Lla/g0$a;
.super Lv9/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lla/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lv9/b<",
        "Lv9/e;",
        "Lla/g0;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 2

    sget-object v0, Lv9/e;->h:Lv9/e$b;

    sget-object v1, Lla/g0$a$a;->j:Lla/g0$a$a;

    invoke-direct {p0, v0, v1}, Lv9/b;-><init>(Lv9/g$c;Lda/l;)V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g;)V
    .locals 0

    invoke-direct {p0}, Lla/g0$a;-><init>()V

    return-void
.end method
