.class public Lcom/google/firebase/firestore/u0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/firestore/u0$b;
    }
.end annotation


# instance fields
.field final a:Lj6/b1;

.field final b:Lcom/google/firebase/firestore/FirebaseFirestore;


# direct methods
.method constructor <init>(Lj6/b1;Lcom/google/firebase/firestore/FirebaseFirestore;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lq6/x;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj6/b1;

    iput-object p1, p0, Lcom/google/firebase/firestore/u0;->a:Lj6/b1;

    invoke-static {p2}, Lq6/x;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/firestore/FirebaseFirestore;

    iput-object p1, p0, Lcom/google/firebase/firestore/u0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    return-void
.end method

.method private A(Lcom/google/firebase/firestore/s;)Lj6/r;
    .locals 4

    instance-of v0, p1, Lcom/google/firebase/firestore/s$b;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    instance-of v2, p1, Lcom/google/firebase/firestore/s$a;

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v2, 0x1

    :goto_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v3, "Parsing is only supported for Filter.UnaryFilter and Filter.CompositeFilter."

    invoke-static {v2, v3, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    if-eqz v0, :cond_2

    check-cast p1, Lcom/google/firebase/firestore/s$b;

    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/u0;->z(Lcom/google/firebase/firestore/s$b;)Lj6/q;

    move-result-object p1

    return-object p1

    :cond_2
    check-cast p1, Lcom/google/firebase/firestore/s$a;

    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/u0;->x(Lcom/google/firebase/firestore/s$a;)Lj6/r;

    move-result-object p1

    return-object p1
.end method

.method private D(Ljava/lang/Object;Lj6/q$b;)V
    .locals 2

    instance-of v0, p1, Ljava/util/List;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid Query. A non-empty array is required for \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lj6/q$b;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\' filters."

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private E()V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/firestore/u0;->a:Lj6/b1;

    invoke-virtual {v0}, Lj6/b1;->l()Lj6/b1$a;

    move-result-object v0

    sget-object v1, Lj6/b1$a;->k:Lj6/b1$a;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/firebase/firestore/u0;->a:Lj6/b1;

    invoke-virtual {v0}, Lj6/b1;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "limitToLast() queries require specifying at least one orderBy() clause"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method private F(Lj6/b1;Lj6/q;)V
    .locals 3

    invoke-virtual {p2}, Lj6/q;->h()Lj6/q$b;

    move-result-object v0

    invoke-virtual {p2}, Lj6/q;->j()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lj6/b1;->q()Lm6/r;

    move-result-object v1

    invoke-virtual {p2}, Lj6/q;->g()Lm6/r;

    move-result-object p2

    if-eqz v1, :cond_1

    invoke-virtual {v1, p2}, Lm6/e;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {v1}, Lm6/r;->h()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v2

    const/4 v1, 0x1

    invoke-virtual {p2}, Lm6/r;->h()Ljava/lang/String;

    move-result-object p2

    aput-object p2, v0, v1

    const-string p2, "All where filters with an inequality (notEqualTo, notIn, lessThan, lessThanOrEqualTo, greaterThan, or greaterThanOrEqualTo) must be on the same field. But you have filters on \'%s\' and \'%s\'"

    invoke-static {p2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {p1}, Lj6/b1;->j()Lm6/r;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-direct {p0, v1, p2}, Lcom/google/firebase/firestore/u0;->I(Lm6/r;Lm6/r;)V

    :cond_2
    invoke-virtual {p1}, Lj6/b1;->i()Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, v0}, Lcom/google/firebase/firestore/u0;->h(Lj6/q$b;)Ljava/util/List;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/firestore/u0;->l(Ljava/util/List;Ljava/util/List;)Lj6/q$b;

    move-result-object p1

    if-eqz p1, :cond_4

    if-ne p1, v0, :cond_3

    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid Query. You cannot use more than one \'"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lj6/q$b;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' filter."

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid Query. You cannot use \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lj6/q$b;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' filters with \'"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lj6/q$b;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\' filters."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    return-void
.end method

.method private G(Lj6/r;)V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/firestore/u0;->a:Lj6/b1;

    invoke-virtual {p1}, Lj6/r;->d()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj6/q;

    invoke-direct {p0, v0, v1}, Lcom/google/firebase/firestore/u0;->F(Lj6/b1;Lj6/q;)V

    invoke-virtual {v0, v1}, Lj6/b1;->e(Lj6/r;)Lj6/b1;

    move-result-object v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method private H(Lm6/r;)V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/firestore/u0;->a:Lj6/b1;

    invoke-virtual {v0}, Lj6/b1;->q()Lm6/r;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/firestore/u0;->a:Lj6/b1;

    invoke-virtual {v1}, Lj6/b1;->j()Lm6/r;

    move-result-object v1

    if-nez v1, :cond_0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, v0}, Lcom/google/firebase/firestore/u0;->I(Lm6/r;Lm6/r;)V

    :cond_0
    return-void
.end method

.method private I(Lm6/r;Lm6/r;)V
    .locals 3

    invoke-virtual {p1, p2}, Lm6/e;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p2}, Lm6/r;->h()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    const/4 v2, 0x1

    aput-object p2, v1, v2

    const/4 p2, 0x2

    invoke-virtual {p1}, Lm6/r;->h()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, p2

    const-string p1, "Invalid query. You have an inequality where filter (whereLessThan(), whereGreaterThan(), etc.) on field \'%s\' and so you must also have \'%s\' as your first orderBy() field, but your first orderBy() is currently on field \'%s\' instead."

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic a(Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/firestore/a1;Lcom/google/firebase/firestore/w0;Lcom/google/firebase/firestore/z;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/google/firebase/firestore/u0;->s(Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/firestore/a1;Lcom/google/firebase/firestore/w0;Lcom/google/firebase/firestore/z;)V

    return-void
.end method

.method public static synthetic b(Lcom/google/firebase/firestore/u0;Lcom/google/android/gms/tasks/Task;)Lcom/google/firebase/firestore/w0;
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/u0;->r(Lcom/google/android/gms/tasks/Task;)Lcom/google/firebase/firestore/w0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/google/firebase/firestore/u0;Lcom/google/firebase/firestore/o;Lj6/y1;Lcom/google/firebase/firestore/z;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/firebase/firestore/u0;->q(Lcom/google/firebase/firestore/o;Lj6/y1;Lcom/google/firebase/firestore/z;)V

    return-void
.end method

.method private f(Ljava/util/concurrent/Executor;Lj6/p$a;Landroid/app/Activity;Lcom/google/firebase/firestore/o;)Lcom/google/firebase/firestore/f0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lj6/p$a;",
            "Landroid/app/Activity;",
            "Lcom/google/firebase/firestore/o<",
            "Lcom/google/firebase/firestore/w0;",
            ">;)",
            "Lcom/google/firebase/firestore/f0;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/firebase/firestore/u0;->E()V

    new-instance v0, Lcom/google/firebase/firestore/t0;

    invoke-direct {v0, p0, p4}, Lcom/google/firebase/firestore/t0;-><init>(Lcom/google/firebase/firestore/u0;Lcom/google/firebase/firestore/o;)V

    new-instance p4, Lj6/h;

    invoke-direct {p4, p1, v0}, Lj6/h;-><init>(Ljava/util/concurrent/Executor;Lcom/google/firebase/firestore/o;)V

    iget-object p1, p0, Lcom/google/firebase/firestore/u0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {p1}, Lcom/google/firebase/firestore/FirebaseFirestore;->s()Lj6/p0;

    move-result-object p1

    iget-object v0, p0, Lcom/google/firebase/firestore/u0;->a:Lj6/b1;

    invoke-virtual {p1, v0, p2, p4}, Lj6/p0;->d0(Lj6/b1;Lj6/p$a;Lcom/google/firebase/firestore/o;)Lj6/c1;

    move-result-object p1

    new-instance p2, Lj6/w0;

    iget-object v0, p0, Lcom/google/firebase/firestore/u0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {v0}, Lcom/google/firebase/firestore/FirebaseFirestore;->s()Lj6/p0;

    move-result-object v0

    invoke-direct {p2, v0, p1, p4}, Lj6/w0;-><init>(Lj6/p0;Lj6/c1;Lj6/h;)V

    invoke-static {p3, p2}, Lj6/d;->c(Landroid/app/Activity;Lcom/google/firebase/firestore/f0;)Lcom/google/firebase/firestore/f0;

    move-result-object p1

    return-object p1
.end method

.method private g(Ljava/lang/String;[Ljava/lang/Object;Z)Lj6/i;
    .locals 6

    iget-object v0, p0, Lcom/google/firebase/firestore/u0;->a:Lj6/b1;

    invoke-virtual {v0}, Lj6/b1;->h()Ljava/util/List;

    move-result-object v0

    array-length v1, p2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-gt v1, v2, :cond_6

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    :goto_0
    array-length v3, p2

    if-ge v2, v3, :cond_5

    aget-object v3, p2, v2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj6/a1;

    invoke-virtual {v4}, Lj6/a1;->c()Lm6/r;

    move-result-object v4

    sget-object v5, Lm6/r;->k:Lm6/r;

    invoke-virtual {v4, v5}, Lm6/e;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    instance-of v4, v3, Ljava/lang/String;

    if-eqz v4, :cond_3

    check-cast v3, Ljava/lang/String;

    iget-object v4, p0, Lcom/google/firebase/firestore/u0;->a:Lj6/b1;

    invoke-virtual {v4}, Lj6/b1;->r()Z

    move-result v4

    if-nez v4, :cond_1

    const-string v4, "/"

    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid query. When querying a collection and ordering by FieldPath.documentId(), the value passed to "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "() must be a plain document ID, but \'"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\' contains a slash."

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    :goto_1
    iget-object v4, p0, Lcom/google/firebase/firestore/u0;->a:Lj6/b1;

    invoke-virtual {v4}, Lj6/b1;->n()Lm6/u;

    move-result-object v4

    invoke-static {v3}, Lm6/u;->v(Ljava/lang/String;)Lm6/u;

    move-result-object v3

    invoke-virtual {v4, v3}, Lm6/e;->g(Lm6/e;)Lm6/e;

    move-result-object v3

    check-cast v3, Lm6/u;

    invoke-static {v3}, Lm6/l;->t(Lm6/u;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {v3}, Lm6/l;->l(Lm6/u;)Lm6/l;

    move-result-object v3

    iget-object v4, p0, Lcom/google/firebase/firestore/u0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {v4}, Lcom/google/firebase/firestore/FirebaseFirestore;->t()Lm6/f;

    move-result-object v4

    invoke-static {v4, v3}, Lm6/y;->F(Lm6/f;Lm6/l;)Ld7/b0;

    move-result-object v3

    goto :goto_2

    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid query. When querying a collection group and ordering by FieldPath.documentId(), the value passed to "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "() must result in a valid document path, but \'"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\' is not because it contains an odd number of segments."

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid query. Expected a string for document ID in "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "(), but got "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    iget-object v4, p0, Lcom/google/firebase/firestore/u0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {v4}, Lcom/google/firebase/firestore/FirebaseFirestore;->x()Lcom/google/firebase/firestore/f1;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/google/firebase/firestore/f1;->h(Ljava/lang/Object;)Ld7/b0;

    move-result-object v3

    :goto_2
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_5
    new-instance p1, Lj6/i;

    invoke-direct {p1, v1, p3}, Lj6/i;-><init>(Ljava/util/List;Z)V

    return-object p1

    :cond_6
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Too many arguments provided to "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "(). The number of arguments must be less than or equal to the number of orderBy() clauses."

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private h(Lj6/q$b;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj6/q$b;",
            ")",
            "Ljava/util/List<",
            "Lj6/q$b;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/firebase/firestore/u0$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq p1, v2, :cond_2

    if-eq p1, v1, :cond_1

    const/4 v3, 0x3

    if-eq p1, v3, :cond_1

    const/4 v4, 0x4

    if-eq p1, v4, :cond_0

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1

    :cond_0
    new-array p1, v4, [Lj6/q$b;

    sget-object v4, Lj6/q$b;->r:Lj6/q$b;

    aput-object v4, p1, v0

    sget-object v0, Lj6/q$b;->s:Lj6/q$b;

    aput-object v0, p1, v2

    sget-object v0, Lj6/q$b;->t:Lj6/q$b;

    aput-object v0, p1, v1

    sget-object v0, Lj6/q$b;->n:Lj6/q$b;

    aput-object v0, p1, v3

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_1
    new-array p1, v2, [Lj6/q$b;

    sget-object v1, Lj6/q$b;->t:Lj6/q$b;

    aput-object v1, p1, v0

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_2
    new-array p1, v1, [Lj6/q$b;

    sget-object v1, Lj6/q$b;->n:Lj6/q$b;

    aput-object v1, p1, v0

    sget-object v0, Lj6/q$b;->t:Lj6/q$b;

    aput-object v0, p1, v2

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private l(Ljava/util/List;Ljava/util/List;)Lj6/q$b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lj6/r;",
            ">;",
            "Ljava/util/List<",
            "Lj6/q$b;",
            ">;)",
            "Lj6/q$b;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj6/r;

    invoke-virtual {v0}, Lj6/r;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj6/q;

    invoke-virtual {v1}, Lj6/q;->h()Lj6/q$b;

    move-result-object v2

    invoke-interface {p2, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Lj6/q;->h()Lj6/q$b;

    move-result-object p1

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method private o(Lcom/google/firebase/firestore/a1;)Lcom/google/android/gms/tasks/Task;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/firestore/a1;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/firebase/firestore/w0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    new-instance v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    new-instance v2, Lj6/p$a;

    invoke-direct {v2}, Lj6/p$a;-><init>()V

    const/4 v3, 0x1

    iput-boolean v3, v2, Lj6/p$a;->a:Z

    iput-boolean v3, v2, Lj6/p$a;->b:Z

    iput-boolean v3, v2, Lj6/p$a;->c:Z

    sget-object v3, Lq6/p;->b:Ljava/util/concurrent/Executor;

    new-instance v4, Lcom/google/firebase/firestore/s0;

    invoke-direct {v4, v0, v1, p1}, Lcom/google/firebase/firestore/s0;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/firestore/a1;)V

    const/4 p1, 0x0

    invoke-direct {p0, v3, v2, p1, v4}, Lcom/google/firebase/firestore/u0;->f(Ljava/util/concurrent/Executor;Lj6/p$a;Landroid/app/Activity;Lcom/google/firebase/firestore/o;)Lcom/google/firebase/firestore/f0;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method private static p(Lcom/google/firebase/firestore/n0;)Lj6/p$a;
    .locals 5

    new-instance v0, Lj6/p$a;

    invoke-direct {v0}, Lj6/p$a;-><init>()V

    sget-object v1, Lcom/google/firebase/firestore/n0;->k:Lcom/google/firebase/firestore/n0;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne p0, v1, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    iput-boolean v4, v0, Lj6/p$a;->a:Z

    if-ne p0, v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    iput-boolean v2, v0, Lj6/p$a;->b:Z

    iput-boolean v3, v0, Lj6/p$a;->c:Z

    return-object v0
.end method

.method private synthetic q(Lcom/google/firebase/firestore/o;Lj6/y1;Lcom/google/firebase/firestore/z;)V
    .locals 3

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    invoke-interface {p1, v0, p3}, Lcom/google/firebase/firestore/o;->a(Ljava/lang/Object;Lcom/google/firebase/firestore/z;)V

    return-void

    :cond_0
    const/4 p3, 0x0

    if-eqz p2, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    new-array p3, p3, [Ljava/lang/Object;

    const-string v2, "Got event without value or error set"

    invoke-static {v1, v2, p3}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    new-instance p3, Lcom/google/firebase/firestore/w0;

    iget-object v1, p0, Lcom/google/firebase/firestore/u0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-direct {p3, p0, p2, v1}, Lcom/google/firebase/firestore/w0;-><init>(Lcom/google/firebase/firestore/u0;Lj6/y1;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    invoke-interface {p1, p3, v0}, Lcom/google/firebase/firestore/o;->a(Ljava/lang/Object;Lcom/google/firebase/firestore/z;)V

    return-void
.end method

.method private synthetic r(Lcom/google/android/gms/tasks/Task;)Lcom/google/firebase/firestore/w0;
    .locals 4

    new-instance v0, Lcom/google/firebase/firestore/w0;

    new-instance v1, Lcom/google/firebase/firestore/u0;

    iget-object v2, p0, Lcom/google/firebase/firestore/u0;->a:Lj6/b1;

    iget-object v3, p0, Lcom/google/firebase/firestore/u0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-direct {v1, v2, v3}, Lcom/google/firebase/firestore/u0;-><init>(Lj6/b1;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj6/y1;

    iget-object v2, p0, Lcom/google/firebase/firestore/u0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-direct {v0, v1, p1, v2}, Lcom/google/firebase/firestore/w0;-><init>(Lcom/google/firebase/firestore/u0;Lj6/y1;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    return-object v0
.end method

.method private static synthetic s(Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/firestore/a1;Lcom/google/firebase/firestore/w0;Lcom/google/firebase/firestore/z;)V
    .locals 1

    const-string v0, "Failed to register a listener for a query result"

    if-eqz p4, :cond_0

    invoke-virtual {p0, p4}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    return-void

    :cond_0
    const/4 p4, 0x0

    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/firestore/f0;

    invoke-interface {p1}, Lcom/google/firebase/firestore/f0;->remove()V

    invoke-virtual {p3}, Lcom/google/firebase/firestore/w0;->p()Lcom/google/firebase/firestore/z0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/firebase/firestore/z0;->b()Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lcom/google/firebase/firestore/a1;->k:Lcom/google/firebase/firestore/a1;

    if-ne p2, p1, :cond_1

    new-instance p1, Lcom/google/firebase/firestore/z;

    const-string p2, "Failed to get documents from server. (However, these documents may exist in the local cache. Run again without setting source to SERVER to retrieve the cached documents.)"

    sget-object p3, Lcom/google/firebase/firestore/z$a;->y:Lcom/google/firebase/firestore/z$a;

    invoke-direct {p1, p2, p3}, Lcom/google/firebase/firestore/z;-><init>(Ljava/lang/String;Lcom/google/firebase/firestore/z$a;)V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p3}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception p0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    new-array p1, p4, [Ljava/lang/Object;

    invoke-static {p0, v0, p1}, Lq6/b;->b(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p0

    throw p0

    :catch_1
    move-exception p0

    new-array p1, p4, [Ljava/lang/Object;

    invoke-static {p0, v0, p1}, Lq6/b;->b(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p0

    throw p0
.end method

.method private w(Lm6/r;Lcom/google/firebase/firestore/u0$b;)Lcom/google/firebase/firestore/u0;
    .locals 2

    const-string v0, "Provided direction must not be null."

    invoke-static {p2, v0}, Lq6/x;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/firestore/u0;->a:Lj6/b1;

    invoke-virtual {v0}, Lj6/b1;->o()Lj6/i;

    move-result-object v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/firebase/firestore/u0;->a:Lj6/b1;

    invoke-virtual {v0}, Lj6/b1;->g()Lj6/i;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/u0;->H(Lm6/r;)V

    sget-object v0, Lcom/google/firebase/firestore/u0$b;->j:Lcom/google/firebase/firestore/u0$b;

    if-ne p2, v0, :cond_0

    sget-object p2, Lj6/a1$a;->k:Lj6/a1$a;

    goto :goto_0

    :cond_0
    sget-object p2, Lj6/a1$a;->l:Lj6/a1$a;

    :goto_0
    new-instance v0, Lcom/google/firebase/firestore/u0;

    iget-object v1, p0, Lcom/google/firebase/firestore/u0;->a:Lj6/b1;

    invoke-static {p2, p1}, Lj6/a1;->d(Lj6/a1$a;Lm6/r;)Lj6/a1;

    move-result-object p1

    invoke-virtual {v1, p1}, Lj6/b1;->B(Lj6/a1;)Lj6/b1;

    move-result-object p1

    iget-object p2, p0, Lcom/google/firebase/firestore/u0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-direct {v0, p1, p2}, Lcom/google/firebase/firestore/u0;-><init>(Lj6/b1;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    return-object v0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid query. You must not call Query.endAt() or Query.endBefore() before calling Query.orderBy()."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid query. You must not call Query.startAt() or Query.startAfter() before calling Query.orderBy()."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private x(Lcom/google/firebase/firestore/s$a;)Lj6/r;
    .locals 4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lcom/google/firebase/firestore/s$a;->m()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/firebase/firestore/s;

    invoke-direct {p0, v2}, Lcom/google/firebase/firestore/u0;->A(Lcom/google/firebase/firestore/s;)Lj6/r;

    move-result-object v2

    invoke-virtual {v2}, Lj6/r;->b()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    const/4 p1, 0x0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj6/r;

    return-object p1

    :cond_2
    new-instance v1, Lj6/l;

    invoke-virtual {p1}, Lcom/google/firebase/firestore/s$a;->n()Lj6/l$a;

    move-result-object p1

    invoke-direct {v1, v0, p1}, Lj6/l;-><init>(Ljava/util/List;Lj6/l$a;)V

    return-object v1
.end method

.method private y(Ljava/lang/Object;)Ld7/b0;
    .locals 3

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_4

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/firebase/firestore/u0;->a:Lj6/b1;

    invoke-virtual {v0}, Lj6/b1;->r()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid query. When querying a collection by FieldPath.documentId() you must provide a plain document ID, but \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\' contains a \'/\' character."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/firebase/firestore/u0;->a:Lj6/b1;

    invoke-virtual {v0}, Lj6/b1;->n()Lm6/u;

    move-result-object v0

    invoke-static {p1}, Lm6/u;->v(Ljava/lang/String;)Lm6/u;

    move-result-object p1

    invoke-virtual {v0, p1}, Lm6/e;->g(Lm6/e;)Lm6/e;

    move-result-object p1

    check-cast p1, Lm6/u;

    invoke-static {p1}, Lm6/l;->t(Lm6/u;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/google/firebase/firestore/u0;->n()Lcom/google/firebase/firestore/FirebaseFirestore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/firestore/FirebaseFirestore;->t()Lm6/f;

    move-result-object v0

    invoke-static {p1}, Lm6/l;->l(Lm6/u;)Lm6/l;

    move-result-object p1

    :goto_1
    invoke-static {v0, p1}, Lm6/y;->F(Lm6/f;Lm6/l;)Ld7/b0;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid query. When querying a collection group by FieldPath.documentId(), the value provided must result in a valid document path, but \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\' is not because it has an odd number of segments ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lm6/e;->q()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid query. When querying with FieldPath.documentId() you must provide a valid document ID, but it was an empty string."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    instance-of v0, p1, Lcom/google/firebase/firestore/m;

    if-eqz v0, :cond_5

    check-cast p1, Lcom/google/firebase/firestore/m;

    invoke-virtual {p0}, Lcom/google/firebase/firestore/u0;->n()Lcom/google/firebase/firestore/FirebaseFirestore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/firestore/FirebaseFirestore;->t()Lm6/f;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/firebase/firestore/m;->l()Lm6/l;

    move-result-object p1

    goto :goto_1

    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid query. When querying with FieldPath.documentId() you must provide a valid String or DocumentReference, but it was of type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lq6/g0;->B(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private z(Lcom/google/firebase/firestore/s$b;)Lj6/q;
    .locals 4

    invoke-virtual {p1}, Lcom/google/firebase/firestore/s$b;->m()Lcom/google/firebase/firestore/q;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/firebase/firestore/s$b;->n()Lj6/q$b;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/firebase/firestore/s$b;->o()Ljava/lang/Object;

    move-result-object p1

    const-string v2, "Provided field path must not be null."

    invoke-static {v0, v2}, Lq6/x;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "Provided op must not be null."

    invoke-static {v1, v2}, Lq6/x;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/google/firebase/firestore/q;->c()Lm6/r;

    move-result-object v2

    invoke-virtual {v2}, Lm6/r;->x()Z

    move-result v2

    if-eqz v2, :cond_4

    sget-object v2, Lj6/q$b;->q:Lj6/q$b;

    if-eq v1, v2, :cond_3

    sget-object v2, Lj6/q$b;->r:Lj6/q$b;

    if-eq v1, v2, :cond_3

    sget-object v2, Lj6/q$b;->s:Lj6/q$b;

    if-eq v1, v2, :cond_1

    sget-object v2, Lj6/q$b;->t:Lj6/q$b;

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/u0;->y(Ljava/lang/Object;)Ld7/b0;

    move-result-object p1

    goto/16 :goto_4

    :cond_1
    :goto_0
    invoke-direct {p0, p1, v1}, Lcom/google/firebase/firestore/u0;->D(Ljava/lang/Object;Lj6/q$b;)V

    invoke-static {}, Ld7/b;->o0()Ld7/b$b;

    move-result-object v2

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/google/firebase/firestore/u0;->y(Ljava/lang/Object;)Ld7/b0;

    move-result-object v3

    invoke-virtual {v2, v3}, Ld7/b$b;->I(Ld7/b0;)Ld7/b$b;

    goto :goto_1

    :cond_2
    invoke-static {}, Ld7/b0;->C0()Ld7/b0$b;

    move-result-object p1

    invoke-virtual {p1, v2}, Ld7/b0$b;->I(Ld7/b$b;)Ld7/b0$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object p1

    check-cast p1, Ld7/b0;

    goto :goto_4

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid query. You can\'t perform \'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lj6/q$b;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\' queries on FieldPath.documentId()."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    sget-object v2, Lj6/q$b;->s:Lj6/q$b;

    if-eq v1, v2, :cond_5

    sget-object v3, Lj6/q$b;->t:Lj6/q$b;

    if-eq v1, v3, :cond_5

    sget-object v3, Lj6/q$b;->r:Lj6/q$b;

    if-ne v1, v3, :cond_6

    :cond_5
    invoke-direct {p0, p1, v1}, Lcom/google/firebase/firestore/u0;->D(Ljava/lang/Object;Lj6/q$b;)V

    :cond_6
    iget-object v3, p0, Lcom/google/firebase/firestore/u0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {v3}, Lcom/google/firebase/firestore/FirebaseFirestore;->x()Lcom/google/firebase/firestore/f1;

    move-result-object v3

    if-eq v1, v2, :cond_8

    sget-object v2, Lj6/q$b;->t:Lj6/q$b;

    if-ne v1, v2, :cond_7

    goto :goto_2

    :cond_7
    const/4 v2, 0x0

    goto :goto_3

    :cond_8
    :goto_2
    const/4 v2, 0x1

    :goto_3
    invoke-virtual {v3, p1, v2}, Lcom/google/firebase/firestore/f1;->i(Ljava/lang/Object;Z)Ld7/b0;

    move-result-object p1

    :goto_4
    invoke-virtual {v0}, Lcom/google/firebase/firestore/q;->c()Lm6/r;

    move-result-object v0

    invoke-static {v0, v1, p1}, Lj6/q;->f(Lm6/r;Lj6/q$b;Ld7/b0;)Lj6/q;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public varargs B([Ljava/lang/Object;)Lcom/google/firebase/firestore/u0;
    .locals 2

    const-string v0, "startAfter"

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Lcom/google/firebase/firestore/u0;->g(Ljava/lang/String;[Ljava/lang/Object;Z)Lj6/i;

    move-result-object p1

    new-instance v0, Lcom/google/firebase/firestore/u0;

    iget-object v1, p0, Lcom/google/firebase/firestore/u0;->a:Lj6/b1;

    invoke-virtual {v1, p1}, Lj6/b1;->C(Lj6/i;)Lj6/b1;

    move-result-object p1

    iget-object v1, p0, Lcom/google/firebase/firestore/u0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-direct {v0, p1, v1}, Lcom/google/firebase/firestore/u0;-><init>(Lj6/b1;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    return-object v0
.end method

.method public varargs C([Ljava/lang/Object;)Lcom/google/firebase/firestore/u0;
    .locals 2

    const-string v0, "startAt"

    const/4 v1, 0x1

    invoke-direct {p0, v0, p1, v1}, Lcom/google/firebase/firestore/u0;->g(Ljava/lang/String;[Ljava/lang/Object;Z)Lj6/i;

    move-result-object p1

    new-instance v0, Lcom/google/firebase/firestore/u0;

    iget-object v1, p0, Lcom/google/firebase/firestore/u0;->a:Lj6/b1;

    invoke-virtual {v1, p1}, Lj6/b1;->C(Lj6/i;)Lj6/b1;

    move-result-object p1

    iget-object v1, p0, Lcom/google/firebase/firestore/u0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-direct {v0, p1, v1}, Lcom/google/firebase/firestore/u0;-><init>(Lj6/b1;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    return-object v0
.end method

.method public J(Lcom/google/firebase/firestore/s;)Lcom/google/firebase/firestore/u0;
    .locals 2

    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/u0;->A(Lcom/google/firebase/firestore/s;)Lj6/r;

    move-result-object p1

    invoke-virtual {p1}, Lj6/r;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/u0;->G(Lj6/r;)V

    new-instance v0, Lcom/google/firebase/firestore/u0;

    iget-object v1, p0, Lcom/google/firebase/firestore/u0;->a:Lj6/b1;

    invoke-virtual {v1, p1}, Lj6/b1;->e(Lj6/r;)Lj6/b1;

    move-result-object p1

    iget-object v1, p0, Lcom/google/firebase/firestore/u0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-direct {v0, p1, v1}, Lcom/google/firebase/firestore/u0;-><init>(Lj6/b1;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    return-object v0
.end method

.method public K(Lcom/google/firebase/firestore/q;Ljava/lang/Object;)Lcom/google/firebase/firestore/u0;
    .locals 0

    invoke-static {p1, p2}, Lcom/google/firebase/firestore/s;->b(Lcom/google/firebase/firestore/q;Ljava/lang/Object;)Lcom/google/firebase/firestore/s;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/firebase/firestore/u0;->J(Lcom/google/firebase/firestore/s;)Lcom/google/firebase/firestore/u0;

    move-result-object p1

    return-object p1
.end method

.method public L(Lcom/google/firebase/firestore/q;Ljava/util/List;)Lcom/google/firebase/firestore/u0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/firestore/q;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/google/firebase/firestore/u0;"
        }
    .end annotation

    invoke-static {p1, p2}, Lcom/google/firebase/firestore/s;->c(Lcom/google/firebase/firestore/q;Ljava/util/List;)Lcom/google/firebase/firestore/s;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/firebase/firestore/u0;->J(Lcom/google/firebase/firestore/s;)Lcom/google/firebase/firestore/u0;

    move-result-object p1

    return-object p1
.end method

.method public M(Lcom/google/firebase/firestore/q;Ljava/lang/Object;)Lcom/google/firebase/firestore/u0;
    .locals 0

    invoke-static {p1, p2}, Lcom/google/firebase/firestore/s;->d(Lcom/google/firebase/firestore/q;Ljava/lang/Object;)Lcom/google/firebase/firestore/s;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/firebase/firestore/u0;->J(Lcom/google/firebase/firestore/s;)Lcom/google/firebase/firestore/u0;

    move-result-object p1

    return-object p1
.end method

.method public N(Lcom/google/firebase/firestore/q;Ljava/lang/Object;)Lcom/google/firebase/firestore/u0;
    .locals 0

    invoke-static {p1, p2}, Lcom/google/firebase/firestore/s;->e(Lcom/google/firebase/firestore/q;Ljava/lang/Object;)Lcom/google/firebase/firestore/s;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/firebase/firestore/u0;->J(Lcom/google/firebase/firestore/s;)Lcom/google/firebase/firestore/u0;

    move-result-object p1

    return-object p1
.end method

.method public O(Lcom/google/firebase/firestore/q;Ljava/lang/Object;)Lcom/google/firebase/firestore/u0;
    .locals 0

    invoke-static {p1, p2}, Lcom/google/firebase/firestore/s;->f(Lcom/google/firebase/firestore/q;Ljava/lang/Object;)Lcom/google/firebase/firestore/s;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/firebase/firestore/u0;->J(Lcom/google/firebase/firestore/s;)Lcom/google/firebase/firestore/u0;

    move-result-object p1

    return-object p1
.end method

.method public P(Lcom/google/firebase/firestore/q;Ljava/util/List;)Lcom/google/firebase/firestore/u0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/firestore/q;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/google/firebase/firestore/u0;"
        }
    .end annotation

    invoke-static {p1, p2}, Lcom/google/firebase/firestore/s;->g(Lcom/google/firebase/firestore/q;Ljava/util/List;)Lcom/google/firebase/firestore/s;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/firebase/firestore/u0;->J(Lcom/google/firebase/firestore/s;)Lcom/google/firebase/firestore/u0;

    move-result-object p1

    return-object p1
.end method

.method public Q(Lcom/google/firebase/firestore/q;Ljava/lang/Object;)Lcom/google/firebase/firestore/u0;
    .locals 0

    invoke-static {p1, p2}, Lcom/google/firebase/firestore/s;->h(Lcom/google/firebase/firestore/q;Ljava/lang/Object;)Lcom/google/firebase/firestore/s;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/firebase/firestore/u0;->J(Lcom/google/firebase/firestore/s;)Lcom/google/firebase/firestore/u0;

    move-result-object p1

    return-object p1
.end method

.method public R(Lcom/google/firebase/firestore/q;Ljava/lang/Object;)Lcom/google/firebase/firestore/u0;
    .locals 0

    invoke-static {p1, p2}, Lcom/google/firebase/firestore/s;->i(Lcom/google/firebase/firestore/q;Ljava/lang/Object;)Lcom/google/firebase/firestore/s;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/firebase/firestore/u0;->J(Lcom/google/firebase/firestore/s;)Lcom/google/firebase/firestore/u0;

    move-result-object p1

    return-object p1
.end method

.method public S(Lcom/google/firebase/firestore/q;Ljava/lang/Object;)Lcom/google/firebase/firestore/u0;
    .locals 0

    invoke-static {p1, p2}, Lcom/google/firebase/firestore/s;->j(Lcom/google/firebase/firestore/q;Ljava/lang/Object;)Lcom/google/firebase/firestore/s;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/firebase/firestore/u0;->J(Lcom/google/firebase/firestore/s;)Lcom/google/firebase/firestore/u0;

    move-result-object p1

    return-object p1
.end method

.method public T(Lcom/google/firebase/firestore/q;Ljava/util/List;)Lcom/google/firebase/firestore/u0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/firestore/q;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/google/firebase/firestore/u0;"
        }
    .end annotation

    invoke-static {p1, p2}, Lcom/google/firebase/firestore/s;->k(Lcom/google/firebase/firestore/q;Ljava/util/List;)Lcom/google/firebase/firestore/s;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/firebase/firestore/u0;->J(Lcom/google/firebase/firestore/s;)Lcom/google/firebase/firestore/u0;

    move-result-object p1

    return-object p1
.end method

.method public d(Lcom/google/firebase/firestore/n0;Lcom/google/firebase/firestore/o;)Lcom/google/firebase/firestore/f0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/firestore/n0;",
            "Lcom/google/firebase/firestore/o<",
            "Lcom/google/firebase/firestore/w0;",
            ">;)",
            "Lcom/google/firebase/firestore/f0;"
        }
    .end annotation

    sget-object v0, Lq6/p;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1, p2}, Lcom/google/firebase/firestore/u0;->e(Ljava/util/concurrent/Executor;Lcom/google/firebase/firestore/n0;Lcom/google/firebase/firestore/o;)Lcom/google/firebase/firestore/f0;

    move-result-object p1

    return-object p1
.end method

.method public e(Ljava/util/concurrent/Executor;Lcom/google/firebase/firestore/n0;Lcom/google/firebase/firestore/o;)Lcom/google/firebase/firestore/f0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lcom/google/firebase/firestore/n0;",
            "Lcom/google/firebase/firestore/o<",
            "Lcom/google/firebase/firestore/w0;",
            ">;)",
            "Lcom/google/firebase/firestore/f0;"
        }
    .end annotation

    const-string v0, "Provided executor must not be null."

    invoke-static {p1, v0}, Lq6/x;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Provided MetadataChanges value must not be null."

    invoke-static {p2, v0}, Lq6/x;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Provided EventListener must not be null."

    invoke-static {p3, v0}, Lq6/x;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/firebase/firestore/u0;->p(Lcom/google/firebase/firestore/n0;)Lj6/p$a;

    move-result-object p2

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0, p3}, Lcom/google/firebase/firestore/u0;->f(Ljava/util/concurrent/Executor;Lj6/p$a;Landroid/app/Activity;Lcom/google/firebase/firestore/o;)Lcom/google/firebase/firestore/f0;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/firebase/firestore/u0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/firebase/firestore/u0;

    iget-object v1, p0, Lcom/google/firebase/firestore/u0;->a:Lj6/b1;

    iget-object v3, p1, Lcom/google/firebase/firestore/u0;->a:Lj6/b1;

    invoke-virtual {v1, v3}, Lj6/b1;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/firebase/firestore/u0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    iget-object p1, p1, Lcom/google/firebase/firestore/u0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/firestore/u0;->a:Lj6/b1;

    invoke-virtual {v0}, Lj6/b1;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/firebase/firestore/u0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public i()Lcom/google/firebase/firestore/c;
    .locals 2

    new-instance v0, Lcom/google/firebase/firestore/c;

    invoke-static {}, Lcom/google/firebase/firestore/a;->a()Lcom/google/firebase/firestore/a$b;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/google/firebase/firestore/c;-><init>(Lcom/google/firebase/firestore/u0;Ljava/util/List;)V

    return-object v0
.end method

.method public varargs j([Ljava/lang/Object;)Lcom/google/firebase/firestore/u0;
    .locals 2

    const-string v0, "endAt"

    const/4 v1, 0x1

    invoke-direct {p0, v0, p1, v1}, Lcom/google/firebase/firestore/u0;->g(Ljava/lang/String;[Ljava/lang/Object;Z)Lj6/i;

    move-result-object p1

    new-instance v0, Lcom/google/firebase/firestore/u0;

    iget-object v1, p0, Lcom/google/firebase/firestore/u0;->a:Lj6/b1;

    invoke-virtual {v1, p1}, Lj6/b1;->d(Lj6/i;)Lj6/b1;

    move-result-object p1

    iget-object v1, p0, Lcom/google/firebase/firestore/u0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-direct {v0, p1, v1}, Lcom/google/firebase/firestore/u0;-><init>(Lj6/b1;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    return-object v0
.end method

.method public varargs k([Ljava/lang/Object;)Lcom/google/firebase/firestore/u0;
    .locals 2

    const-string v0, "endBefore"

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Lcom/google/firebase/firestore/u0;->g(Ljava/lang/String;[Ljava/lang/Object;Z)Lj6/i;

    move-result-object p1

    new-instance v0, Lcom/google/firebase/firestore/u0;

    iget-object v1, p0, Lcom/google/firebase/firestore/u0;->a:Lj6/b1;

    invoke-virtual {v1, p1}, Lj6/b1;->d(Lj6/i;)Lj6/b1;

    move-result-object p1

    iget-object v1, p0, Lcom/google/firebase/firestore/u0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-direct {v0, p1, v1}, Lcom/google/firebase/firestore/u0;-><init>(Lj6/b1;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    return-object v0
.end method

.method public m(Lcom/google/firebase/firestore/a1;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/firestore/a1;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/firebase/firestore/w0;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/firebase/firestore/u0;->E()V

    sget-object v0, Lcom/google/firebase/firestore/a1;->l:Lcom/google/firebase/firestore/a1;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/google/firebase/firestore/u0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {p1}, Lcom/google/firebase/firestore/FirebaseFirestore;->s()Lj6/p0;

    move-result-object p1

    iget-object v0, p0, Lcom/google/firebase/firestore/u0;->a:Lj6/b1;

    invoke-virtual {p1, v0}, Lj6/p0;->C(Lj6/b1;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    sget-object v0, Lq6/p;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/google/firebase/firestore/r0;

    invoke-direct {v1, p0}, Lcom/google/firebase/firestore/r0;-><init>(Lcom/google/firebase/firestore/u0;)V

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/tasks/Task;->continueWith(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/u0;->o(Lcom/google/firebase/firestore/a1;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public n()Lcom/google/firebase/firestore/FirebaseFirestore;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/u0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    return-object v0
.end method

.method public t(J)Lcom/google/firebase/firestore/u0;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_0

    new-instance v0, Lcom/google/firebase/firestore/u0;

    iget-object v1, p0, Lcom/google/firebase/firestore/u0;->a:Lj6/b1;

    invoke-virtual {v1, p1, p2}, Lj6/b1;->t(J)Lj6/b1;

    move-result-object p1

    iget-object p2, p0, Lcom/google/firebase/firestore/u0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-direct {v0, p1, p2}, Lcom/google/firebase/firestore/u0;-><init>(Lj6/b1;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid Query. Query limit ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ") is invalid. Limit must be positive."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public u(J)Lcom/google/firebase/firestore/u0;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_0

    new-instance v0, Lcom/google/firebase/firestore/u0;

    iget-object v1, p0, Lcom/google/firebase/firestore/u0;->a:Lj6/b1;

    invoke-virtual {v1, p1, p2}, Lj6/b1;->u(J)Lj6/b1;

    move-result-object p1

    iget-object p2, p0, Lcom/google/firebase/firestore/u0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-direct {v0, p1, p2}, Lcom/google/firebase/firestore/u0;-><init>(Lj6/b1;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid Query. Query limitToLast ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ") is invalid. Limit must be positive."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public v(Lcom/google/firebase/firestore/q;Lcom/google/firebase/firestore/u0$b;)Lcom/google/firebase/firestore/u0;
    .locals 1

    const-string v0, "Provided field path must not be null."

    invoke-static {p1, v0}, Lq6/x;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/firebase/firestore/q;->c()Lm6/r;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/firestore/u0;->w(Lm6/r;Lcom/google/firebase/firestore/u0$b;)Lcom/google/firebase/firestore/u0;

    move-result-object p1

    return-object p1
.end method
