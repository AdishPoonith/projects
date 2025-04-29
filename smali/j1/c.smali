.class public final Lj1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj1/c$a;
    }
.end annotation


# static fields
.field public static final b:Lj1/c$a;

.field private static final c:Ljava/lang/String;

.field private static d:Lj1/c;


# instance fields
.field private final a:Ljava/lang/Thread$UncaughtExceptionHandler;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj1/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lj1/c$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lj1/c;->b:Lj1/c$a;

    const-class v0, Lj1/c;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lj1/c;->c:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Ljava/lang/Thread$UncaughtExceptionHandler;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj1/c;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Thread$UncaughtExceptionHandler;Lkotlin/jvm/internal/g;)V
    .locals 0

    invoke-direct {p0, p1}, Lj1/c;-><init>(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    return-void
.end method

.method public static final synthetic a()Lj1/c;
    .locals 1

    sget-object v0, Lj1/c;->d:Lj1/c;

    return-object v0
.end method

.method public static final synthetic b()Ljava/lang/String;
    .locals 1

    sget-object v0, Lj1/c;->c:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic c(Lj1/c;)V
    .locals 0

    sput-object p0, Lj1/c;->d:Lj1/c;

    return-void
.end method


# virtual methods
.method public uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "t"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "e"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lh1/k;->a:Lh1/k;

    invoke-static {p2}, Lh1/k;->j(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lh1/b;->a:Lh1/b;

    invoke-static {p2}, Lh1/b;->c(Ljava/lang/Throwable;)V

    sget-object v0, Lh1/c$a;->a:Lh1/c$a;

    sget-object v0, Lh1/c$c;->m:Lh1/c$c;

    invoke-static {p2, v0}, Lh1/c$a;->b(Ljava/lang/Throwable;Lh1/c$c;)Lh1/c;

    move-result-object v0

    invoke-virtual {v0}, Lh1/c;->g()V

    :cond_0
    iget-object v0, p0, Lj1/c;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
