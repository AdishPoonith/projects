.class public final synthetic Lcom/google/firebase/storage/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lcom/google/firebase/storage/y;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Lcom/google/firebase/storage/s$a;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/storage/y;Ljava/lang/Object;Lcom/google/firebase/storage/s$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/storage/x;->j:Lcom/google/firebase/storage/y;

    iput-object p2, p0, Lcom/google/firebase/storage/x;->k:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/firebase/storage/x;->l:Lcom/google/firebase/storage/s$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/storage/x;->j:Lcom/google/firebase/storage/y;

    iget-object v1, p0, Lcom/google/firebase/storage/x;->k:Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/firebase/storage/x;->l:Lcom/google/firebase/storage/s$a;

    invoke-static {v0, v1, v2}, Lcom/google/firebase/storage/y;->c(Lcom/google/firebase/storage/y;Ljava/lang/Object;Lcom/google/firebase/storage/s$a;)V

    return-void
.end method
