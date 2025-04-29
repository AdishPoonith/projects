.class public final Lq9/e$g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq9/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq9/e$g$b;,
        Lq9/e$g$c;,
        Lq9/e$g$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Long;

.field public final b:Ljava/lang/Long;

.field public final c:Ljava/lang/Long;

.field public final d:Ljava/lang/Integer;

.field public final e:Lq9/e$g$c;

.field public final f:Lq9/e$g$b;

.field public final g:Lio/grpc/internal/e2$b;


# direct methods
.method private constructor <init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Lq9/e$g$c;Lq9/e$g$b;Lio/grpc/internal/e2$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq9/e$g;->a:Ljava/lang/Long;

    iput-object p2, p0, Lq9/e$g;->b:Ljava/lang/Long;

    iput-object p3, p0, Lq9/e$g;->c:Ljava/lang/Long;

    iput-object p4, p0, Lq9/e$g;->d:Ljava/lang/Integer;

    iput-object p5, p0, Lq9/e$g;->e:Lq9/e$g$c;

    iput-object p6, p0, Lq9/e$g;->f:Lq9/e$g$b;

    iput-object p7, p0, Lq9/e$g;->g:Lio/grpc/internal/e2$b;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Lq9/e$g$c;Lq9/e$g$b;Lio/grpc/internal/e2$b;Lq9/e$a;)V
    .locals 0

    invoke-direct/range {p0 .. p7}, Lq9/e$g;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Lq9/e$g$c;Lq9/e$g$b;Lio/grpc/internal/e2$b;)V

    return-void
.end method


# virtual methods
.method a()Z
    .locals 1

    iget-object v0, p0, Lq9/e$g;->e:Lq9/e$g$c;

    if-nez v0, :cond_1

    iget-object v0, p0, Lq9/e$g;->f:Lq9/e$g$b;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
