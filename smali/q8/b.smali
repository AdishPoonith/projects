.class public Lq8/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lr8/k;

.field private b:Lf8/a;

.field private c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lr8/k$d;",
            ">;>;"
        }
    .end annotation
.end field

.field final d:Lr8/k$c;


# direct methods
.method public constructor <init>(Le8/a;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lq8/b$a;

    invoke-direct {v0, p0}, Lq8/b$a;-><init>(Lq8/b;)V

    iput-object v0, p0, Lq8/b;->d:Lr8/k$c;

    new-instance v1, Lr8/k;

    sget-object v2, Lr8/s;->b:Lr8/s;

    const-string v3, "flutter/deferredcomponent"

    invoke-direct {v1, p1, v3, v2}, Lr8/k;-><init>(Lr8/c;Ljava/lang/String;Lr8/l;)V

    iput-object v1, p0, Lq8/b;->a:Lr8/k;

    invoke-virtual {v1, v0}, Lr8/k;->e(Lr8/k$c;)V

    invoke-static {}, Ld8/a;->e()Ld8/a;

    move-result-object p1

    invoke-virtual {p1}, Ld8/a;->a()Lf8/a;

    move-result-object p1

    iput-object p1, p0, Lq8/b;->b:Lf8/a;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lq8/b;->c:Ljava/util/Map;

    return-void
.end method

.method static synthetic a(Lq8/b;)Lf8/a;
    .locals 0

    iget-object p0, p0, Lq8/b;->b:Lf8/a;

    return-object p0
.end method

.method static synthetic b(Lq8/b;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lq8/b;->c:Ljava/util/Map;

    return-object p0
.end method


# virtual methods
.method public c(Lf8/a;)V
    .locals 0

    iput-object p1, p0, Lq8/b;->b:Lf8/a;

    return-void
.end method
