.class public abstract Lp9/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp9/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Lp9/b<",
        "TS;>;>",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Li9/d;

.field private final b:Li9/c;


# direct methods
.method protected constructor <init>(Li9/d;Li9/c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "channel"

    invoke-static {p1, v0}, Lb5/n;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li9/d;

    iput-object p1, p0, Lp9/b;->a:Li9/d;

    const-string p1, "callOptions"

    invoke-static {p2, p1}, Lb5/n;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li9/c;

    iput-object p1, p0, Lp9/b;->b:Li9/c;

    return-void
.end method


# virtual methods
.method protected abstract a(Li9/d;Li9/c;)Lp9/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li9/d;",
            "Li9/c;",
            ")TS;"
        }
    .end annotation
.end method

.method public final b()Li9/c;
    .locals 1

    iget-object v0, p0, Lp9/b;->b:Li9/c;

    return-object v0
.end method

.method public final c(Li9/b;)Lp9/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li9/b;",
            ")TS;"
        }
    .end annotation

    iget-object v0, p0, Lp9/b;->a:Li9/d;

    iget-object v1, p0, Lp9/b;->b:Li9/c;

    invoke-virtual {v1, p1}, Li9/c;->l(Li9/b;)Li9/c;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lp9/b;->a(Li9/d;Li9/c;)Lp9/b;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljava/util/concurrent/Executor;)Lp9/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            ")TS;"
        }
    .end annotation

    iget-object v0, p0, Lp9/b;->a:Li9/d;

    iget-object v1, p0, Lp9/b;->b:Li9/c;

    invoke-virtual {v1, p1}, Li9/c;->n(Ljava/util/concurrent/Executor;)Li9/c;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lp9/b;->a(Li9/d;Li9/c;)Lp9/b;

    move-result-object p1

    return-object p1
.end method
