.class public final synthetic Ls0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Ljava/lang/Integer;

.field public final synthetic k:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Integer;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls0/h;->j:Ljava/lang/Integer;

    iput-object p2, p0, Ls0/h;->k:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ls0/h;->j:Ljava/lang/Integer;

    iget-object v1, p0, Ls0/h;->k:Ljava/util/List;

    invoke-static {v0, v1}, Ls0/g$b;->a(Ljava/lang/Integer;Ljava/util/List;)V

    return-void
.end method
