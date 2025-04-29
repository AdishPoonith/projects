.class final Lu1/c0$j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu1/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "j"
.end annotation


# instance fields
.field public final a:Ls1/b3;

.field public final b:Z

.field public final c:J

.field public final d:J


# direct methods
.method private constructor <init>(Ls1/b3;ZJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu1/c0$j;->a:Ls1/b3;

    iput-boolean p2, p0, Lu1/c0$j;->b:Z

    iput-wide p3, p0, Lu1/c0$j;->c:J

    iput-wide p5, p0, Lu1/c0$j;->d:J

    return-void
.end method

.method synthetic constructor <init>(Ls1/b3;ZJJLu1/c0$a;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lu1/c0$j;-><init>(Ls1/b3;ZJJ)V

    return-void
.end method
