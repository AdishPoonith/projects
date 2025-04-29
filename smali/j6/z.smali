.class public final synthetic Lj6/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lj6/p0;

.field public final synthetic k:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lj6/p0;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj6/z;->j:Lj6/p0;

    iput-object p2, p0, Lj6/z;->k:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lj6/z;->j:Lj6/p0;

    iget-object v1, p0, Lj6/z;->k:Ljava/util/List;

    invoke-static {v0, v1}, Lj6/p0;->i(Lj6/p0;Ljava/util/List;)V

    return-void
.end method
