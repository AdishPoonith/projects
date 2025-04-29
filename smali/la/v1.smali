.class public interface abstract Lla/v1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv9/g$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lla/v1$b;,
        Lla/v1$a;
    }
.end annotation


# static fields
.field public static final g:Lla/v1$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lla/v1$b;->j:Lla/v1$b;

    sput-object v0, Lla/v1;->g:Lla/v1$b;

    return-void
.end method


# virtual methods
.method public abstract H(Lv9/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv9/d<",
            "-",
            "Ls9/u;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract O()Ljava/util/concurrent/CancellationException;
.end method

.method public abstract T(Ljava/util/concurrent/CancellationException;)V
.end method

.method public abstract U(Lla/t;)Lla/r;
.end method

.method public abstract a()Z
.end method

.method public abstract b0(Lda/l;)Lla/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lda/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Ls9/u;",
            ">;)",
            "Lla/c1;"
        }
    .end annotation
.end method

.method public abstract start()Z
.end method

.method public abstract v(ZZLda/l;)Lla/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lda/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Ls9/u;",
            ">;)",
            "Lla/c1;"
        }
    .end annotation
.end method

.method public abstract w()Lja/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lja/b<",
            "Lla/v1;",
            ">;"
        }
    .end annotation
.end method
