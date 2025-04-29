.class public final Lf1/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf1/b;
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

    invoke-direct {p0}, Lf1/b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Lf1/b;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lf1/b;->a()Lf1/b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lf1/b;->a()Lf1/b;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Lf1/b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lf1/b;-><init>(Landroid/content/Context;Lkotlin/jvm/internal/g;)V

    invoke-static {v0}, Lf1/b;->b(Lf1/b;)V

    invoke-static {v0}, Lf1/b;->c(Lf1/b;)V

    invoke-static {}, Lf1/b;->a()Lf1/b;

    move-result-object p1

    return-object p1
.end method
