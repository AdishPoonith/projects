.class public final synthetic Lm6/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lm6/i;->a:Ljava/util/Comparator;

    return-void
.end method

.method public static synthetic a(Lm6/i;Lm6/i;)I
    .locals 0

    invoke-interface {p0}, Lm6/i;->getKey()Lm6/l;

    move-result-object p0

    invoke-interface {p1}, Lm6/i;->getKey()Lm6/l;

    move-result-object p1

    invoke-virtual {p0, p1}, Lm6/l;->g(Lm6/l;)I

    move-result p0

    return p0
.end method
