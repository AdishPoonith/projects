.class final Lcom/google/android/gms/internal/auth/y2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/auth/t3;


# static fields
.field private static final b:Lcom/google/android/gms/internal/auth/e3;


# instance fields
.field private final a:Lcom/google/android/gms/internal/auth/e3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/auth/w2;

    invoke-direct {v0}, Lcom/google/android/gms/internal/auth/w2;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/auth/y2;->b:Lcom/google/android/gms/internal/auth/e3;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    new-instance v0, Lcom/google/android/gms/internal/auth/x2;

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/google/android/gms/internal/auth/e3;

    invoke-static {}, Lcom/google/android/gms/internal/auth/d2;->a()Lcom/google/android/gms/internal/auth/d2;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    :try_start_0
    const-string v2, "com.google.protobuf.DescriptorMessageInfoFactory"

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const-string v4, "getInstance"

    new-array v5, v3, [Ljava/lang/Class;

    invoke-virtual {v2, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    const/4 v4, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v2, v4, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/auth/e3;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v2, Lcom/google/android/gms/internal/auth/y2;->b:Lcom/google/android/gms/internal/auth/e3;

    :goto_0
    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/auth/x2;-><init>([Lcom/google/android/gms/internal/auth/e3;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v1, "messageInfoFactory"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/auth/k2;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object v0, p0, Lcom/google/android/gms/internal/auth/y2;->a:Lcom/google/android/gms/internal/auth/e3;

    return-void
.end method

.method private static a(Lcom/google/android/gms/internal/auth/d3;)Z
    .locals 1

    invoke-interface {p0}, Lcom/google/android/gms/internal/auth/d3;->zzc()I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    return v0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final zza(Ljava/lang/Class;)Lcom/google/android/gms/internal/auth/s3;
    .locals 9

    const-class v0, Lcom/google/android/gms/internal/auth/g2;

    invoke-static {p1}, Lcom/google/android/gms/internal/auth/u3;->g(Ljava/lang/Class;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/auth/y2;->a:Lcom/google/android/gms/internal/auth/e3;

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/auth/e3;->zzb(Ljava/lang/Class;)Lcom/google/android/gms/internal/auth/d3;

    move-result-object v3

    invoke-interface {v3}, Lcom/google/android/gms/internal/auth/d3;->zzb()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/auth/u3;->c()Lcom/google/android/gms/internal/auth/j4;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/auth/z1;->b()Lcom/google/android/gms/internal/auth/x1;

    move-result-object v0

    :goto_0
    invoke-interface {v3}, Lcom/google/android/gms/internal/auth/d3;->zza()Lcom/google/android/gms/internal/auth/g3;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/l3;->f(Lcom/google/android/gms/internal/auth/j4;Lcom/google/android/gms/internal/auth/x1;Lcom/google/android/gms/internal/auth/g3;)Lcom/google/android/gms/internal/auth/l3;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/auth/u3;->a()Lcom/google/android/gms/internal/auth/j4;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/auth/z1;->a()Lcom/google/android/gms/internal/auth/x1;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v3}, Lcom/google/android/gms/internal/auth/y2;->a(Lcom/google/android/gms/internal/auth/d3;)Z

    move-result v0

    invoke-static {}, Lcom/google/android/gms/internal/auth/n3;->b()Lcom/google/android/gms/internal/auth/m3;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/auth/u2;->d()Lcom/google/android/gms/internal/auth/u2;

    move-result-object v5

    invoke-static {}, Lcom/google/android/gms/internal/auth/u3;->c()Lcom/google/android/gms/internal/auth/j4;

    move-result-object v6

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/google/android/gms/internal/auth/z1;->b()Lcom/google/android/gms/internal/auth/x1;

    move-result-object v7

    goto :goto_1

    :cond_2
    const/4 v7, 0x0

    :goto_1
    invoke-static {}, Lcom/google/android/gms/internal/auth/c3;->b()Lcom/google/android/gms/internal/auth/b3;

    move-result-object v8

    goto :goto_3

    :cond_3
    invoke-static {v3}, Lcom/google/android/gms/internal/auth/y2;->a(Lcom/google/android/gms/internal/auth/d3;)Z

    move-result v0

    invoke-static {}, Lcom/google/android/gms/internal/auth/n3;->a()Lcom/google/android/gms/internal/auth/m3;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/auth/u2;->c()Lcom/google/android/gms/internal/auth/u2;

    move-result-object v5

    if-eqz v0, :cond_4

    invoke-static {}, Lcom/google/android/gms/internal/auth/u3;->a()Lcom/google/android/gms/internal/auth/j4;

    move-result-object v6

    invoke-static {}, Lcom/google/android/gms/internal/auth/z1;->a()Lcom/google/android/gms/internal/auth/x1;

    move-result-object v7

    goto :goto_2

    :cond_4
    invoke-static {}, Lcom/google/android/gms/internal/auth/u3;->b()Lcom/google/android/gms/internal/auth/j4;

    move-result-object v6

    const/4 v7, 0x0

    :goto_2
    invoke-static {}, Lcom/google/android/gms/internal/auth/c3;->a()Lcom/google/android/gms/internal/auth/b3;

    move-result-object v8

    :goto_3
    move-object v2, p1

    invoke-static/range {v2 .. v8}, Lcom/google/android/gms/internal/auth/j3;->r(Ljava/lang/Class;Lcom/google/android/gms/internal/auth/d3;Lcom/google/android/gms/internal/auth/m3;Lcom/google/android/gms/internal/auth/u2;Lcom/google/android/gms/internal/auth/j4;Lcom/google/android/gms/internal/auth/x1;Lcom/google/android/gms/internal/auth/b3;)Lcom/google/android/gms/internal/auth/j3;

    move-result-object p1

    return-object p1
.end method
