.class final Lka/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lja/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lja/b<",
        "Lha/f;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/CharSequence;

.field private final b:I

.field private final c:I

.field private final d:Lda/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lda/p<",
            "Ljava/lang/CharSequence;",
            "Ljava/lang/Integer;",
            "Ls9/m<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;IILda/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "II",
            "Lda/p<",
            "-",
            "Ljava/lang/CharSequence;",
            "-",
            "Ljava/lang/Integer;",
            "Ls9/m<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getNextMatch"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lka/e;->a:Ljava/lang/CharSequence;

    iput p2, p0, Lka/e;->b:I

    iput p3, p0, Lka/e;->c:I

    iput-object p4, p0, Lka/e;->d:Lda/p;

    return-void
.end method

.method public static final synthetic a(Lka/e;)Lda/p;
    .locals 0

    iget-object p0, p0, Lka/e;->d:Lda/p;

    return-object p0
.end method

.method public static final synthetic b(Lka/e;)Ljava/lang/CharSequence;
    .locals 0

    iget-object p0, p0, Lka/e;->a:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public static final synthetic c(Lka/e;)I
    .locals 0

    iget p0, p0, Lka/e;->c:I

    return p0
.end method

.method public static final synthetic d(Lka/e;)I
    .locals 0

    iget p0, p0, Lka/e;->b:I

    return p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lha/f;",
            ">;"
        }
    .end annotation

    new-instance v0, Lka/e$a;

    invoke-direct {v0, p0}, Lka/e$a;-><init>(Lka/e;)V

    return-object v0
.end method
