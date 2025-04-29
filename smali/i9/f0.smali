.class public abstract Li9/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li9/f0$b;
    }
.end annotation


# static fields
.field public static final a:Li9/a$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li9/a$c<",
            "Li9/f0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "internal:io.grpc.config-selector"

    invoke-static {v0}, Li9/a$c;->a(Ljava/lang/String;)Li9/a$c;

    move-result-object v0

    sput-object v0, Li9/f0;->a:Li9/a$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(Li9/r0$f;)Li9/f0$b;
.end method
