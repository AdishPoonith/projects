.class public final Lf1/e0$f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf1/e0$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g;)V
    .locals 0

    invoke-direct {p0}, Lf1/e0$f$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lf1/e0$e;I)Lf1/e0$f;
    .locals 2

    new-instance v0, Lf1/e0$f;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf1/e0$f;-><init>(Lkotlin/jvm/internal/g;)V

    invoke-static {v0, p1}, Lf1/e0$f;->a(Lf1/e0$f;Lf1/e0$e;)V

    invoke-static {v0, p2}, Lf1/e0$f;->b(Lf1/e0$f;I)V

    return-object v0
.end method

.method public final b()Lf1/e0$f;
    .locals 2

    new-instance v0, Lf1/e0$f;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf1/e0$f;-><init>(Lkotlin/jvm/internal/g;)V

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lf1/e0$f;->b(Lf1/e0$f;I)V

    return-object v0
.end method
