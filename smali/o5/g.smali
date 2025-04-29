.class public final Lo5/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo5/g$b;
    }
.end annotation


# static fields
.field private static final b:Lo5/g;

.field private static final c:Lo5/g$b;


# instance fields
.field private final a:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lr5/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo5/g;

    invoke-direct {v0}, Lo5/g;-><init>()V

    sput-object v0, Lo5/g;->b:Lo5/g;

    new-instance v0, Lo5/g$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo5/g$b;-><init>(Lo5/g$a;)V

    sput-object v0, Lo5/g;->c:Lo5/g$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lo5/g;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static b()Lo5/g;
    .locals 1

    sget-object v0, Lo5/g;->b:Lo5/g;

    return-object v0
.end method


# virtual methods
.method public a()Lr5/b;
    .locals 1

    iget-object v0, p0, Lo5/g;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr5/b;

    if-nez v0, :cond_0

    sget-object v0, Lo5/g;->c:Lo5/g$b;

    :cond_0
    return-object v0
.end method
