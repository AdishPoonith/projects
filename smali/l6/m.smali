.class public final Ll6/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:Ld6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld6/c<",
            "Lm6/l;",
            "Lm6/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(ILd6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ld6/c<",
            "Lm6/l;",
            "Lm6/i;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll6/m;->a:I

    iput-object p2, p0, Ll6/m;->b:Ld6/c;

    return-void
.end method

.method public static a(ILjava/util/Map;)Ll6/m;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Map<",
            "Lm6/l;",
            "Ll6/d1;",
            ">;)",
            "Ll6/m;"
        }
    .end annotation

    invoke-static {}, Lm6/j;->a()Ld6/c;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm6/l;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll6/d1;

    invoke-virtual {v1}, Ll6/d1;->a()Lm6/i;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ld6/c;->p(Ljava/lang/Object;Ljava/lang/Object;)Ld6/c;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance p1, Ll6/m;

    invoke-direct {p1, p0, v0}, Ll6/m;-><init>(ILd6/c;)V

    return-object p1
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Ll6/m;->a:I

    return v0
.end method

.method public c()Ld6/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld6/c<",
            "Lm6/l;",
            "Lm6/i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ll6/m;->b:Ld6/c;

    return-object v0
.end method
