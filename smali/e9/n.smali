.class final Le9/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr8/d$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le9/n$b;,
        Le9/n$a;
    }
.end annotation


# instance fields
.field private a:Lr8/d$b;

.field private final b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private c:Z


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le9/n;->b:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput-boolean v0, p0, Le9/n;->c:Z

    return-void
.end method

.method private d(Ljava/lang/Object;)V
    .locals 1

    iget-boolean v0, p0, Le9/n;->c:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Le9/n;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private e()V
    .locals 5

    iget-object v0, p0, Le9/n;->a:Lr8/d$b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Le9/n;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Le9/n$a;

    if-eqz v2, :cond_1

    iget-object v1, p0, Le9/n;->a:Lr8/d$b;

    invoke-interface {v1}, Lr8/d$b;->c()V

    goto :goto_0

    :cond_1
    instance-of v2, v1, Le9/n$b;

    if-eqz v2, :cond_2

    check-cast v1, Le9/n$b;

    iget-object v2, p0, Le9/n;->a:Lr8/d$b;

    iget-object v3, v1, Le9/n$b;->a:Ljava/lang/String;

    iget-object v4, v1, Le9/n$b;->b:Ljava/lang/String;

    iget-object v1, v1, Le9/n$b;->c:Ljava/lang/Object;

    invoke-interface {v2, v3, v4, v1}, Lr8/d$b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    iget-object v2, p0, Le9/n;->a:Lr8/d$b;

    invoke-interface {v2, v1}, Lr8/d$b;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Le9/n;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, Le9/n;->d(Ljava/lang/Object;)V

    invoke-direct {p0}, Le9/n;->e()V

    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    new-instance v0, Le9/n$b;

    invoke-direct {v0, p1, p2, p3}, Le9/n$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0, v0}, Le9/n;->d(Ljava/lang/Object;)V

    invoke-direct {p0}, Le9/n;->e()V

    return-void
.end method

.method public c()V
    .locals 1

    new-instance v0, Le9/n$a;

    invoke-direct {v0}, Le9/n$a;-><init>()V

    invoke-direct {p0, v0}, Le9/n;->d(Ljava/lang/Object;)V

    invoke-direct {p0}, Le9/n;->e()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Le9/n;->c:Z

    return-void
.end method

.method public f(Lr8/d$b;)V
    .locals 0

    iput-object p1, p0, Le9/n;->a:Lr8/d$b;

    invoke-direct {p0}, Le9/n;->e()V

    return-void
.end method
