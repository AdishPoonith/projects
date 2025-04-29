.class public final Lcom/google/firebase/firestore/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/firestore/a0$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Z

.field private final c:Z

.field private final d:J

.field private e:Lcom/google/firebase/firestore/j0;


# direct methods
.method private constructor <init>(Lcom/google/firebase/firestore/a0$b;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/firebase/firestore/a0$b;->b(Lcom/google/firebase/firestore/a0$b;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/firestore/a0;->a:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/firebase/firestore/a0$b;->c(Lcom/google/firebase/firestore/a0$b;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/firebase/firestore/a0;->b:Z

    invoke-static {p1}, Lcom/google/firebase/firestore/a0$b;->d(Lcom/google/firebase/firestore/a0$b;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/firebase/firestore/a0;->c:Z

    invoke-static {p1}, Lcom/google/firebase/firestore/a0$b;->e(Lcom/google/firebase/firestore/a0$b;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/firebase/firestore/a0;->d:J

    invoke-static {p1}, Lcom/google/firebase/firestore/a0$b;->a(Lcom/google/firebase/firestore/a0$b;)Lcom/google/firebase/firestore/j0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/firebase/firestore/a0;->e:Lcom/google/firebase/firestore/j0;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/firebase/firestore/a0$b;Lcom/google/firebase/firestore/a0$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/a0;-><init>(Lcom/google/firebase/firestore/a0$b;)V

    return-void
.end method

.method static synthetic a(Lcom/google/firebase/firestore/a0;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/google/firebase/firestore/a0;->a:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic b(Lcom/google/firebase/firestore/a0;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/firebase/firestore/a0;->b:Z

    return p0
.end method

.method static synthetic c(Lcom/google/firebase/firestore/a0;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/firebase/firestore/a0;->c:Z

    return p0
.end method

.method static synthetic d(Lcom/google/firebase/firestore/a0;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/firebase/firestore/a0;->d:J

    return-wide v0
.end method

.method static synthetic e(Lcom/google/firebase/firestore/a0;)Lcom/google/firebase/firestore/j0;
    .locals 0

    iget-object p0, p0, Lcom/google/firebase/firestore/a0;->e:Lcom/google/firebase/firestore/j0;

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 6

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_6

    const-class v1, Lcom/google/firebase/firestore/a0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/google/firebase/firestore/a0;

    iget-boolean v1, p0, Lcom/google/firebase/firestore/a0;->b:Z

    iget-boolean v2, p1, Lcom/google/firebase/firestore/a0;->b:Z

    if-eq v1, v2, :cond_2

    return v0

    :cond_2
    iget-boolean v1, p0, Lcom/google/firebase/firestore/a0;->c:Z

    iget-boolean v2, p1, Lcom/google/firebase/firestore/a0;->c:Z

    if-eq v1, v2, :cond_3

    return v0

    :cond_3
    iget-wide v1, p0, Lcom/google/firebase/firestore/a0;->d:J

    iget-wide v3, p1, Lcom/google/firebase/firestore/a0;->d:J

    cmp-long v5, v1, v3

    if-eqz v5, :cond_4

    return v0

    :cond_4
    iget-object v1, p0, Lcom/google/firebase/firestore/a0;->a:Ljava/lang/String;

    iget-object v2, p1, Lcom/google/firebase/firestore/a0;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v0

    :cond_5
    iget-object v0, p0, Lcom/google/firebase/firestore/a0;->e:Lcom/google/firebase/firestore/j0;

    iget-object p1, p1, Lcom/google/firebase/firestore/a0;->e:Lcom/google/firebase/firestore/j0;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_6
    :goto_0
    return v0
.end method

.method public f()Lcom/google/firebase/firestore/j0;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/a0;->e:Lcom/google/firebase/firestore/j0;

    return-object v0
.end method

.method public g()J
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/firestore/a0;->e:Lcom/google/firebase/firestore/j0;

    if-eqz v0, :cond_2

    instance-of v1, v0, Lcom/google/firebase/firestore/p0;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/google/firebase/firestore/p0;

    invoke-virtual {v0}, Lcom/google/firebase/firestore/p0;->a()J

    move-result-wide v0

    return-wide v0

    :cond_0
    check-cast v0, Lcom/google/firebase/firestore/k0;

    invoke-virtual {v0}, Lcom/google/firebase/firestore/k0;->a()Lcom/google/firebase/firestore/l0;

    move-result-object v1

    instance-of v1, v1, Lcom/google/firebase/firestore/m0;

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/google/firebase/firestore/k0;->a()Lcom/google/firebase/firestore/l0;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/firestore/m0;

    invoke-virtual {v0}, Lcom/google/firebase/firestore/m0;->a()J

    move-result-wide v0

    return-wide v0

    :cond_1
    const-wide/16 v0, -0x1

    return-wide v0

    :cond_2
    iget-wide v0, p0, Lcom/google/firebase/firestore/a0;->d:J

    return-wide v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/a0;->a:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 5

    iget-object v0, p0, Lcom/google/firebase/firestore/a0;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/google/firebase/firestore/a0;->b:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/google/firebase/firestore/a0;->c:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/google/firebase/firestore/a0;->d:J

    const/16 v3, 0x20

    ushr-long v3, v1, v3

    xor-long/2addr v1, v3

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/firebase/firestore/a0;->e:Lcom/google/firebase/firestore/j0;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public i()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/firestore/a0;->e:Lcom/google/firebase/firestore/j0;

    if-eqz v0, :cond_0

    instance-of v0, v0, Lcom/google/firebase/firestore/p0;

    return v0

    :cond_0
    iget-boolean v0, p0, Lcom/google/firebase/firestore/a0;->c:Z

    return v0
.end method

.method public j()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/firebase/firestore/a0;->b:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FirebaseFirestoreSettings{host="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/google/firebase/firestore/a0;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sslEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/google/firebase/firestore/a0;->b:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", persistenceEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/google/firebase/firestore/a0;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", cacheSizeBytes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/google/firebase/firestore/a0;->d:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", cacheSettings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/google/firebase/firestore/a0;->e:Lcom/google/firebase/firestore/j0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "null"

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/google/firebase/firestore/a0;->e:Lcom/google/firebase/firestore/j0;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method
